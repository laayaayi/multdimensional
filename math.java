class laya4{
    public static void main(String[] args){
        int [][] matrix={{2,3,6,7},{3,4,9,8}};
        int[][] matrix2=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix2[i][j]=matrix[i][j];
            
            }
        }
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                System.out.print("matrix["+i+"]["+j+"]="+matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println("***************************************************");
         int[][] result=summatrix(matrix,matrix2);
         for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print("matrix["+i+"]["+j+"]="+result[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        int[][] result2=scalermulmatrix(matrix,100);
        displaymatrix(result2);
        displaymatrix(matrix2);


    }
    public static int[][] summatrix(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        return a;
    }
    public static int[][] scalermulmatrix(int[][] t,int s){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                t[i][j]=t[i][j]*s;
            }
        }
        return t;
    }
    public static int[][] submatrix(int[][] a,int[][] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=a[i][j]-b[i][j];
            }
        }
        return a;
    }
     public static void displaymatrix(int[][] result2){
       for(int i=0;i<result2.length;i++){
            for(int j=0;j<result2[i].length;j++){
                System.out.print("matrix["+i+"]["+j+"]="+result2[i][j]);
            }
            System.out.println();
        }
    }
}