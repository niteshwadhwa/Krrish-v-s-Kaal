import greenfoot.*; 
public class EasyMode extends Screen implements IRecordStrategy,IModeChain {
    
    private IModeChain nextMode;
    @Override
    public void updateScore(int score) {
        Counter.value += score*2;
    }
    
    public void setNextInChainMode(IModeChain nextMode){
        this.nextMode=nextMode;
    }
    
    public void setModeScreen(){
        Screen screen;
        if(Greenfoot.isKeyDown("e")) {
            setScreen(new GameScreen(1));
        }else{
            nextMode.setModeScreen();
        } 
    }   
}
