import java.io.*;

public class javac {
    public void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = in.readLine();
            if (line == null) break;
            String aa = j2c(line);
            String bb= c2j(line);

            if (aa == null && bb == null)
                System.out.println("Error!");
            else
                System.out.println(aa != null ? aa : bb);
        }
    }

    String c2j(String s) {
        if (s.length() == 0) return null;
        String res = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) return null;
            if (c == '_') {
                if (i == 0 || flag) return null;
                flag = true;
            } else {
                if (flag) c = Character.toUpperCase(c);
                flag = false;
                res = res + c;
            }
        }
        if (flag) return null;
        return res;
    }

    String j2c(String s) {
        if (s.length() == 0) return null;
        if (Character.isUpperCase(s.charAt(0))) return null;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_') return null;
            if (Character.isUpperCase(c))
                res = res + "_";
            res = res + Character.toLowerCase(c);
        }
        return res;
    }

    public static void main(String args[]) {
        try {
            new javac().run();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}