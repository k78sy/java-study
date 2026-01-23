package ch06.sec09;

public class ArrayListString {
    String[] arr;

    public ArrayListString(){
        arr = new String[0]; // 방갯수가 0개인 배열
    }

    public void add(String text){
        // 자바는 push로 배열을 늘리는데 불가능하므로
        // 가능한 것처럼 만들어보려고 함

        // 전역변수 arr이 가리키고 있는 배열보다 한 칸 더 큰 배열을 만든다.
        // 그리고 마지막 방에 text를 넣는다.
        String[] temp = new String[arr.length + 1];
        int lastIdx = arr.length;
        temp[lastIdx] = text;

        for (int i = 0; i < lastIdx; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
    public void add(int idx, String text){
        String[] temp = new String[arr.length + 1];

//        for (int i=0; i<temp.length;i++){
//            if(i<idx){
//                temp[i] = arr [i];
//            }else{
//            temp[i] = arr[i - 1];
//            }
//        }
        for (int i=0; i<temp.length;i++){
            temp[i] = arr[i<idx? i : i-1];
        }

//        for(int i=0; i<idx; i++){
//            temp[i] = arr [i];
//        }
//        for(int i=idx; i<temp.length; i++){
//            temp[i] = arr [i-1];
//        }
        temp[idx] = text;

        arr = temp;
    }

    public String get(int idx){
        return arr[idx];
    }

    public String remove(){
        int lastIdx = arr.length - 1;
//        String lastString = arr[lastIdx];
        String[] temp = new String[lastIdx];
        String lastString = get(temp.length);

        for(int i=0; i<lastIdx;i++){
            temp[i] = arr[i];
        }

        arr = temp;
        return lastString;
    }
    public String remove(int idx){
        String delString = get(idx);
        String[] temp = new String[arr.length - 1];

//        for(int i=0; i< idx; i++){
//            temp[i] = arr[i];
//        }
//        for(int i=idx; i< temp.length; i++){
//            temp[i] = arr[i + 1];
//        }
        for(int i=0; i<temp.length;i++){
            temp[i] = arr[i < idx? i: i + 1];
        }

        arr = temp;
        return delString;
    }
    public void remove(String val){
        int idx = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == val){
                idx = i;
            }
        }
        String[] temp = new String[arr.length - 1];
        for(int i=0; i<temp.length;i++){
            temp[i] = arr[i < idx? i: i + 1];
        }
        arr = temp;

        /// //////////////// 강사님 답
        for(int i=0; i<arr.length; i++){
            if(val == arr[i]){
                remove(i);
                return;
            }
        }
    }
//    @Override
//    public String toString(){
//        String temp = "";
//
//        for(int i=0; i<arr.length;i++){
//            if(i==0){
//                temp = arr[i];
//            }else{
//                temp += "," + arr[i];
//            }
//        }
//
//        return "[" + temp + "]";
//    }

    @Override
    public String toString(){
        if(arr.length == 0 ){return "[]"; }
        String temp = arr[0];
        for(int i=1; i<arr.length;i++){
            temp += "," + arr[i];
        }
        return "[" + temp + "]";
    }

}


