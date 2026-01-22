package starcraft;
//시저탱크(공성 전차)
public class Tank extends Unit{
    private boolean isSiegeMode;
//    private String presentMode = "OFF";
//    private String modeMemory;

    public void changeMode(){
        isSiegeMode= !isSiegeMode;
//        if(isSiegeMode){
//            modeMemory = presentMode;
//            presentMode = "ON";
//        }else{
//            presentMode = modeMemory;
//        }
//        System.out.printf("시즈 모드 %s\n", presentMode);
        System.out.printf("시즈 모드 %s\n" , isSiegeMode? "ON" : "OFF");
    }

    @Override
    public String toString(){
        return "시즈탱크@" + super.hashCode();
    }
}
