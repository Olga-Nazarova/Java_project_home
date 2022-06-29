public class project_3{
    public static void main(String[] args){
        int n = 6;
        System.out.println(triangleFun(n));
    }

    public static int triangleFun(int n) {
        if(n==1) return 1;
        else return( n + triangleFun(n-1) );
    }
}
