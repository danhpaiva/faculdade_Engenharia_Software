package Lista5_Fabricio;

public class AreaCirculo {
 
        public static void main(String[] args) throws IOException {
     
            Scanner input = new Scanner(System.in);
    
            Double raioCirculo = 0.0;
            Double areaCirculo = 0.0;
            Double pi = 3.14159;
    
            raioCirculo = input.nextDouble();
    
            areaCirculo = pi * Math.pow(raioCirculo, 2);
    
            System.out.printf("A=%.4f", areaCirculo);
            System.out.println();
    
            input.close();
        }

}
