package corejava.contract;

public class Glass implements Comparable<Glass> {
	
	  private String material;
      private Size size;
      public Glass(Size size,String material)
      {
             this.size=size;
             this.material=material;
      }
	
	public enum Size{
		BIG(3),MEDIUM(2),SMALL(1);
		private int size;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		Size(int size){
			this.size = size;
		}
	}
	
	@Override
    public int hashCode() {
           final int prime = 31;
           int result = 1;
           result = prime * result
                        + ((material == null) ? 0 : material.hashCode());
           result = prime * result + ((size == null) ? 0 : size.hashCode());
           return result;
    }
	
	@Override
	public boolean equals(Object obj){
		if (obj == null)
			return false;
		
		if(this == obj)
			return true;
		
		if(getClass() != obj.getClass())
			return false;
		
		Glass other = (Glass) obj;
		
		return false;
	}

	@Override
	public int compareTo(Glass o) {
	
		return 0;
	}

}
