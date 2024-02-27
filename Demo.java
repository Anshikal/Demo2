class Demo
{
	public static void main(String ar[])
	{
		int i,j,k=1;
		int x[]={15,20,10,30,40,40,50,60,70,80};
		for(i=1;i<x.length-1;i++)
		{
			for(j=0;j<x.length-1;j++)
			{
				if(x[i]!=x[j])
					x[k++%9]=x[j];
			}
		}		
		for(i=0;i<k;i++)
		{
System.out.println(x[i]);
		}		
	}
}