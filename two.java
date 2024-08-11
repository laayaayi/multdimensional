class laya2{
    public static void main(String[] args){
        int [][] matrix={{2,6,5,7},{7,9,8},{1,9,4,3,2}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("matrix["+i+"]["+j+"]="+matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}