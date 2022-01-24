public class UnOrderedArray {
    private int[] m_array;
    private int numElements;
    private int maxSize;
    
    public UnOrderedArray(int size){
        maxSize=size;
        numElements=0;
        m_array = new int[maxSize];
    }
    
    public void addLast(int item){
        if (numElements<maxSize){
            m_array[numElements] = item;
            numElements++;           
        }      
    }
    
    public void listItems(){
        for (int index =0; index <numElements ;index++){
               System.out.print(m_array[index]+" ");
        }
        System.out.println("");
    }
    
    public void listItems(int amountToPrint){
        if ( amountToPrint<=numElements){
            for (int index =0; index <amountToPrint ;index++){
                   System.out.print(m_array[index]+" ");
            }
            System.out.println("");
        }
    }
    
    public void selectionSort(){     
        for (int start=0; start<numElements-1;start++){
            // find the smallest
            int smallestLoc =start;
            for (int index=start+1; index<numElements;index++){
                if (m_array[index]<m_array[smallestLoc]){
                    smallestLoc=index;
                }
            }      
            // swap with the starting point
            int temp =m_array[start];
            m_array[start]=m_array[smallestLoc];
            m_array[smallestLoc]=temp;
        }
    }   
    
    public void insertionSortAsc(){
        // generate starting positions
        for (int start=1; start <numElements; start++){
            int temp = m_array[start]; // save the value "pull it up"
            //insert it in order with respect to the items before it.
            int presPos =start-1;
            while (presPos>=0 && m_array[presPos]>temp){
                m_array[presPos+1]=m_array[presPos];
                presPos--;
            }
            m_array[presPos+1]=temp;      
        }           
    }
 
}
