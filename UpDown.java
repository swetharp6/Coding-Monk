public class UpDown {
    public static void main(String[] args) {
        String s="UDUDUDDDUUUU";
        int level=0;
        char[] ch=s.toCharArray();
        for (char c: ch) {
            if(c=='D')
                level--;
            else
                level++;
        }
        System.out.println(level);
    }
}

