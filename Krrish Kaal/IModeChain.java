/**
 * Write a description of class IModeChain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IModeChain
{
  public void setNextInChainMode(IModeChain nextMode);
  public void setModeScreen();
}