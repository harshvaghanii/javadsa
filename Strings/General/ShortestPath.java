package Strings.General;

public class ShortestPath {
    public static double shortestPath(String s) {
        double distance = 0;
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'N': {
                    y++;
                    break;
                }
                case 'E': {
                    x++;
                    break;
                }
                case 'W': {
                    x--;
                    break;
                }
                case 'S': {
                    y--;
                    break;
                }
            }
        }
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    public static void main(String[] args) {
        String s = "WNEENESENNN";
        double distance = shortestPath(s);
        System.out.println("The shortest distance is : " + distance);
    }

}
