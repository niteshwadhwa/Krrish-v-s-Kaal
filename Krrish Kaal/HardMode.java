import greenfoot.*; 
public class HardMode extends Screen implements IRecordStrategy,IModeChain {
    private IModeChain nextMode;
    @Override
    public void updateScore(int score) {
        Counter.value += score/2;
    }
    
     public void setNextInChainMode(IModeChain nextMode){
       this.nextMode=nextMode;
    }
     
    public void setModeScreen(){
        Screen screen;
       if(Greenfoot.isKeyDown("h")) {
           setScreen(new GameScreen(3));
        } 
       if(Greenfoot.isKeyDown("b")) {
            setScreen(new ChooseNameScreen());
       }
    }   
}