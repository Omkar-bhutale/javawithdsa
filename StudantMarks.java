package CollectionFramework;
class StudantMarks implements Comparable<StudantMarks>{
    private int maths;
    private int physics;
    public int getMaths() {
        return maths;
    }
    public int getPhysics() {
        return physics;
    }
    public StudantMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }
    @Override
    public String toString() {
        return "StudantMarks [maths=" + maths + ", physics=" + physics + "]";
    }
    @Override
    public int compareTo(StudantMarks o) {
               //cureent object<oher object
        // return -1

        //current object>other object
        //return 1

        //current object==other object
        // //return 0
        // if(this.maths>o.maths)
        // return 1;
        // if(this.maths<o.maths)
        // return -1;
        // if(this.maths==o.maths)
        // return 0;
       // return this.maths-o.maths; 
       return o.maths-this.maths;

        
    }
    
   
    

    
}
