public class Point {

   // fields
   private double xcor;
   private double ycor;
   private double adjoinLimit;
   private double xAxisLimit;
   private double xAxisHeight;
   private double yAxisLimit;
   private double yAxisWidth;

   //constructor
   public Point( double xcor, double ycor) {
      this.xcor = xcor;
      this.ycor = ycor;
   }

   public void setAdjoinLimit( double radius) {
      adjoinLimit = radius;
   }

   public void setAdjoinLimit( double xaxisLimit, double xAxisHeight, double yaxisLimit, double yAxisWidth) {
      /*  Cause this point to remember the EXTENTS ALONG 2 AXES of how
          far away another Point can be, while still being considered
          "in the neighborhood" of this Point.
      */

      this.xAxisLimit = xaxisLimit;
      this.xAxisHeight = xAxisHeight;
      this.yAxisLimit = yaxisLimit;
      this.yAxisWidth = yAxisWidth;
    }

    public double getAdjoinLimit() {
      return adjoinLimit;
    }

    public double getXaxisAdjoinLimit() {
      /* Convey the current extent of the neighborhood ALONG THE x AXIS
      */
      return xAxisLimit;
    }

    public double getYaxisAdjoinLimit() {
      /* Convey the current extent of the neighborhood ALONG THE y AXIS
      */
      return yAxisLimit;
    }

    public boolean adjoins( Point other) {
      /* Convey the true/false value of the boolean statement
         "The other Point is within this Point's neighborhood,
         IN TWO DIMENSIONS."
      */
      return (
         (this.xcor - xAxisLimit < other.xcor) && (other.xcor < this.xcor + xAxisLimit)
         &&
         (this.ycor - yAxisLimit < other.ycor) && (other.ycor < this.ycor + yAxisLimit)
      );
    }
}
