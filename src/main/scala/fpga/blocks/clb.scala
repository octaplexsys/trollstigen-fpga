import fpga.blocks.AnyBlock

package fpga.blocks{
  class CLB(locationXY: (Int,Int)) extends AnyBlock{
    val location = locationXY
    var inputsEnable = Array.fill[Boolean](6)(false)
    var outputEnable = false
    var clockEnable  = false
    var muxSelect    = false       // true will select DFF, false defaults to LUT6 output
    var dFFResetEnable  = false
    var dFFResetValue   = false
    var lutSRAMBits     = Array.fill[Boolean](64)(false)

    def configure(netlistNode: scala.xml.Node){
    }
  }
}