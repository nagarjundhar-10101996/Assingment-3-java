class Q4 {
    public static void main(String[] args) {
    int n = 4;
    for (int i = 0; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            
            System.out.print("  ");
        }
        for (int j = 1; j <= 2*i-1; j++) {
            
            System.out.print(Math.abs(j-i)+1+" ");
        }
        System.out.println();
    }
    
    }
}
