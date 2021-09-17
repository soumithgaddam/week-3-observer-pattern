package walletfactory.commanddesign;

public class InvokerClass {
	
	Command command;
	public void setCommand(Command command)
	{
		this.command = command;
	}
	
	public void executeCommand()
	{
		command.execute();
	}
}
