public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
            String[] str = s.split(":");
            int hour = Integer.parseInt(str[0]);
            
            String min = str[1];
            String secPeriod = str[2];
            String sec = str[2].substring(0,secPeriod.length()-2);
            String period = str[2].substring(secPeriod.length()-2,secPeriod.length());
            
            String newTimeString = "";
            
            if((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))){
                 newTimeString =  String.format("%02d" ,hour) + ":" + min + ":" + sec;
            }
            else if((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))){
                newTimeString = (12 + hour) + ":" + min + ":" + sec;
            }
            else if((hour == 12) && (period.equalsIgnoreCase("AM"))){
                newTimeString = "00" + ":" + min + ":" + sec;
            }
            else if((hour == 12) && (period.equalsIgnoreCase("PM"))){
                newTimeString = hour + ":" + min + ":" + sec;
            }
            return newTimeString;
            
        }
}
