/**
 * This code is under the LGPL (Lesser or Library GNU Public License).
 * Do not mix it with the stricter GPL (GNU Public License)
 * You can link to it freely.
 * Any Changes to it must be made public or you will face legal penalties.
 */

public class EuMessstation
{
  private double kelvin;
  String ort;
  
  EuMessstation(String ort)
  {
    this.ort = ort;
  }
  
  void setTemp(double celsius)
  {
    this.kelvin = celsius +  273.15;
  }
  
  double getTempKelvin()
  {
    return this.kelvin;
  }
  
  String getOrt()
  {
    return this.ort;
  }
}
