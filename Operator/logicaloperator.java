public class logicaloperator {
    public static void main(String[] args) {
        int p= 10 ; int q = 20; int r= 5;
        System.out.println((p>q)&&(p>r));
        System.out.println((p>q)&&(q>r));
        System.out.println((p<q)&&(p>r));
        System.out.println((p<q)&&(q<r));

        System.out.println((p>q)||(q<r));
        System.out.println((p>q)||(q>r));
        System.out.println((p>q)||(p>r));
        System.out.println((p>q)||(p>r));

        System.out.println(!(p==q));
        System.out.println(!(p<q));
    }
}
