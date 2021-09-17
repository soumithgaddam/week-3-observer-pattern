package walletfactory.commanddesign;

public class WalletForMenCommand implements Command{
    Wallet wallet;
    public WalletForMenCommand(Wallet wallet)
    {
    	this.wallet = wallet;
    }
	@Override
	public void execute() {
		wallet.menWallet();
   }
}