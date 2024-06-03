public class Arr{
    private int count;
    private int arraysize;
    private int array[];

    public void Arr(){
        count = 0;
        arraysize = 1;
        array= new int[1];
    }
    public void addElement(int a){
        if (count == arraysize){
            growsize();
        }
    array[count] = a;
    count++;
    }

    public void growsize(){
    int temp[] = null;
    if (count == arraysize){
        temp = new int[arraysize*2];{
    for (int i=0; i<arraysize;i++){
        temp[i] = array[i];
    }
    }
    }

    array = temp;
    arraysize = arraysize*2;
    }

    public static void main(String[] args) {
        Arr obj = new Arr();
        obj.addElement(43);
        obj.addElement(23);
                
        System.out.println("Elements of array are:");
        for (int i=0; i < obj.arraysize; i++){
            // System.out.println(obj.array[i] + " ");

        }
        System.out.println("Size of the array: " + obj.arraysize);
        System.out.println("No. of elements in the array: " + obj.count);
    }
}