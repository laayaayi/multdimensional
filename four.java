class laya3{
    public static void main(String[] args){
        int [][][][] matrix={
            {
            {{2,5,4},{9,7,5},{5,4,3,2}}
           ,{{1,2,4,6},{8,3,4,2}}
                             },
                             {
            {{2,5,4},{9,7,5},{5,4,3,2}}
           ,{{1,2,4,6},{8,3,4,2}}
                             }
                             };
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            for(int k=0;k<matrix[i][j].length;k++){
                for(int m=0;m<matrix[i][j][k].length;m++){
                     System.out.print("matrix+["+i+"]["+j+"]["+k+"]["+m+"]="+matrix[i][j][k][m]);
                }
               System.out.println();
            }
            System.out.println("******************************************");
        }
        System.out.println("==============================================");
       }                     
    }

}