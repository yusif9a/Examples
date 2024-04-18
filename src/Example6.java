public class Example6 {
    static String timeConversin(String s) {
        if(s.charAt(8)=='P'){

            String portion = s.substring(0,8);
            String[] times = portion.split(":");
            if(times[0].matches("12")){
                return times[0] + ":" + times[1] + ":" + times[2];
            }
            times[0] = String.valueOf(Integer.valueOf(times[0]) + 12);
            return times[0] + ":" + times[1] + ":" + times[2];
        }else{
            String portion = s.substring(0,8);
            String[] times = portion.split(":");
            if(times[0].matches("12")){
                times[0]= "00";
                return times[0] + ":" + times[1] + ":" + times[2];
            }
            return s.substring(0,8);
        }
    }
}
