package walletfactory.commanddesign;

public class WalletMaterialCommand implements Command{
    Wallet wallet;
    public WalletMaterialCommand(Wallet wallet)
    {
    	this.wallet = wallet;
    }
	@Override
	public void execute() {
		wallet.materialUsed();
   }
}