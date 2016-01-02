import greenfoot.*; 
public class NormalMode extends Screen implements IRecordStrategy,IModeChain {
    private IModeChain nextMode;
    @Override
    public void updateScore(int score) {
        Counter.value += score;
    }
    
    public void setNextInChainMode(IModeChain nextMode){
        this.nextMode=nextMode;
    }
     
    public void setModeScreen(){
        Screen screen;
        if(Greenfoot.isKeyDown("n")) {
            setScreen(new GameScreen(2));
        }else{
            nextMode.setModeScreen();
        } 
    }   
}