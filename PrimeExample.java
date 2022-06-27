public class PrimeExample {
    public static void main(String args[]) {
        int m, i, flag = 0;
        int n = Integer.parseInt(args[0]);
        m = n/2; 

        if (n==0 || n==0) {
            System.out.println(n + " nie je prvocislo"); 
        } else {
            for (i = 2; i<= m; i++) {

                if (n%i == 0) {
                    System.out.println(n + " nie je prvocislo");

                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + " je prvocislo");
            }

        }
    }
}
