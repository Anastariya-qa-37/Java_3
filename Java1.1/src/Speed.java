import java.io.*;

public class Speed {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter values speed: ");
            String speed = bufferedReader.readLine();
        System.out.println("Enter values distance: ");
            String distance = bufferedReader.readLine();
        System.out.println("Enter values time: ");
            String time = bufferedReader.readLine();

        if (speed.isEmpty() && !time.isEmpty() && !distance.isEmpty()){
            int distanceX = Integer.parseInt(distance);
            int timeX = Integer.parseInt(time);
            int speedX = distanceX/timeX;
            System.out.println(speedX +" km/h");
        }
        else if (speed.isEmpty() && (time.isEmpty() || distance.isEmpty())) {
            System.out.println("Enter at least 2 values (speed,time,distance) ");
        }

        if (distance.isEmpty() && !speed.isEmpty() && !time.isEmpty()){
            int timeY = Integer.parseInt(time);
            int speedY = Integer.parseInt(speed);
            int distanceY = speedY*timeY;
            System.out.println(distanceY +" km");
        }
        else if (distance.isEmpty() && (time.isEmpty() || speed.isEmpty())) {
            System.out.println("Enter at least 2 values (speed,time,distance) ");
        }

        if  (time.isEmpty() && !speed.isEmpty() && !distance.isEmpty()){
            int speedZ = Integer.parseInt(speed);
            int distanceZ = Integer.parseInt(distance);
            int timeZ = speedZ/distanceZ;
            System.out.println(timeZ + "h");
        }
       else if (time.isEmpty() && (speed.isEmpty() || distance.isEmpty())){
            System.out.println("Enter at least 2 values (speed,time,distance) ");
       }


    }
}