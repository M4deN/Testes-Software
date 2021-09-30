package MockingEX10;

public class MessageTransformer {
	private Logger logger;
	private Helper helper;
	
	public MessageTransformer(Logger logger, Helper helper) {
		
		this.logger = logger;
		this.helper = helper;
	}
	public String transform(String message) {
		String originalMessage = message;
		for(String censoredWorld : helper.getCensoredWorlds()) {
			message = message.replaceAll(censoredWorld, "???");
		}
		if(!message.equals(originalMessage)){
			if(!logger.logTransformation(originalMessage, message))
				throw new RuntimeException("No Conection to database");
		}
		return message;
	}
}
