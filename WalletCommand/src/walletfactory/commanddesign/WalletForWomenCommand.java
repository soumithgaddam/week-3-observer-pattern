package walletfactory.commanddesign;

public class WalletForWomenCommand implements Command{
    Wallet wallet;
    public WalletForWomenCommand(Wallet wallet)
    {
    	this.wallet = wallet;
    }
	@Override
	public void execute() {
		wallet.womenWallet();
   }
}