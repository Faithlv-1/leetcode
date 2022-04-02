public class four_eight {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println("aa");
    }
    public static void rotate(int[][] matrix) {
        int[][] matrix2=new int[matrix.length][matrix.length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix2[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                matrix[j][matrix.length-i-1]=matrix2[i][j];
            }
        }
    }
}
