package walletfactory.commanddesign;

public class WalletTypeCommand  implements Command{
    Wallet wallet;
    public WalletTypeCommand(Wallet wallet)
    {
    	this.wallet = wallet;
    }
	@Override
	public void execute() {
		wallet.walletType();
   }
}
