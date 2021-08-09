package Mocking;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class TransformTest {

    @Test
    void testMessageOriginal() {
   	 
   	 Helper helperMock = mock(Helper.class);
   	 String[] censoredWorlds = {"abc", "xYz", "uuu"};
   	 when(helperMock.getCensoredWorlds()).thenReturn(censoredWorlds);
   	 
   	 Logger loggerMock = mock(Logger.class);
   	 when(loggerMock.logTransformation(anyString(),anyString())).thenReturn(true);
   	 
   	 var transformer = new MessageTransformer(loggerMock, helperMock);
   	 var res = transformer.transform("As Palavras abc e xYz nao aparecem");
   	 assertEquals("As Palavras ??? e ??? nao aparecem", res);
    }
    
    @Test
    void testException() {
   	 
   	 Helper helperMock = mock(Helper.class);
   	 String[] censoredWorlds = {"abc", "xYz", "uuu"};
   	 when(helperMock.getCensoredWorlds()).thenReturn(censoredWorlds);
   	 
   	 Logger loggerMock = mock(Logger.class);
   	 when(loggerMock.logTransformation(anyString(),anyString())).thenReturn(false);
   	 
   	 var transformer = new MessageTransformer(loggerMock, helperMock);
   	 var res = transformer.transform("No Conection to database");
   	 
   	 assertThrows(RuntimeException.class, () -> { transformer.transform("abcb xYz");
   	 
   	 });
    }
    
    @Test
    void testMessageNormal() {
   	 
   	 Helper helperMock = mock(Helper.class);
   	 String[] censoredWorlds = {};
   	 when(helperMock.getCensoredWorlds()).thenReturn(censoredWorlds);
   	 
   	 Logger loggerMock = mock(Logger.class);
   	 when(loggerMock.logTransformation(anyString(),anyString())).thenReturn(true);
   	 
   	 var transformer = new MessageTransformer(loggerMock, helperMock);
   	 var res = transformer.transform("As Palavras aparecem");
   	 assertEquals("As Palavras aparecem", res);
    }
    
    
    @Test
    void testUmaPalavraCensurada() {
   	 
   	 Helper helperMock = mock(Helper.class);
   	 String[] censoredWorlds = {"abc"};
   	 when(helperMock.getCensoredWorlds()).thenReturn(censoredWorlds);
   	 
   	 Logger loggerMock = mock(Logger.class);
   	 when(loggerMock.logTransformation(anyString(),anyString())).thenReturn(true);
   	 
   	 var transformer = new MessageTransformer(loggerMock, helperMock);
   	 var res = transformer.transform("As Palavras abc nao aparecem");
   	 assertEquals("As Palavras ??? nao aparecem", res);
    }
}
