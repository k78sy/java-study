package starcraft;
// 수송선
public class Dropship extends Unit{
    //8개의 유닛을 태울 수 있는 공간이 필요해요
    private Unit[] units = new Unit[8];
    private int space = 0;

    public void load(Unit unit){
        // 구현
//        if(space< units.length){
//            units[space++] = unit;
//            System.out.printf("탑승: %s\n", unit);
//        }else{
//            System.out.printf("대기: %s\n", unit);
//        }
        if(space == units.length){
            return;
        }
        units[space++] = unit;
        // 강사님 이코드가 더 깔끔한 방식
    }

    public Unit unload(int num){
        Unit unloadUnit = units[num];

//        Unit[] temp = new Unit[units.length];
//        for(int i=0; i < temp.length; i++){
//            if(i<num){
//                temp[i] = units[i];
//            }else if(i>=num && i< temp.length -1){
//                temp[i] = units[i + 1];
//            }
//        }
//        space--
//        units = temp;

        // 강사님 1
        int len = units.length - 1;
        for(int i=num; i<len; i++) {
            int next = i + 1;
            if(units[next] == null) { break; }
            units[i] = units[next];
            units[next] = null;
        }


        /// / 강사님 2

        for(int i=num+1; i< units.length; i++){
            if(units[i] == null){break;}
            units[i-1]=units[i];
        }
        units[--space] = null;

        return unloadUnit;
    }

    public void check(){
        System.out.println("------------------------");
        for(int i=0; i<units.length; i++){
            System.out.printf("[%d]: %s\n", i, units[i]);
        }
    }
}
