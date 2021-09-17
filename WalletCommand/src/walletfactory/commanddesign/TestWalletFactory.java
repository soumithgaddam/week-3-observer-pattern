package walletfactory.commanddesign;

public class TestWalletFactory {

	public static void main(String[] args) {
		Wallet wallet = new Wallet();
		InvokerClass invoker =new InvokerClass();
		invoker.setCommand(new WalletTypeCommand(wallet));
		invoker.executeCommand();
		
		invoker.setCommand(new WalletForMenCommand(wallet));
		invoker.executeCommand();
		
		invoker.setCommand(new WalletForWomenCommand(wallet));
		invoker.executeCommand();
		
		invoker.setCommand(new WalletMaterialCommand(wallet));
		invoker.executeCommand();
	}

}
