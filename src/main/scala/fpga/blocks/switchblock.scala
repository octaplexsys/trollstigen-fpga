import fpga.Types._
import fpga.BlockEnum._

package fpga.blocks{
  class SwitchBlock(locationXY: (Int,Int), pbEnum : BlockEnum, switchConnectivity: Connectivity)
  extends RoutingBlock(locationXY: (Int,Int), pbEnum : BlockEnum, switchConnectivity: Connectivity){
  }
}
