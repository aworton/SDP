package bc

import library.ByteCode.{getPopValue, getPopVirtualMachine}
import vm.VirtualMachine

/**
  * Implements a concrete [[ByteCode]] Instruction
  * @author Matthew Keri
  * @author Alexander Worton
  */
class iRem() extends ByteCode with ByteCodeValues{

  /** @see [[ByteCode.code]] */
  override val code: Byte = bytecode("irem")

  /**
    * Pop the top two values from the VirtualMachine stack, modulo the first by the
    * second and push the result
    * @param vm the virtual machine
    * @return the updated virtual machine
    */
  override def execute(vm: VirtualMachine): VirtualMachine = {
    val firstPop = vm.pop()
    val secondPop = getPopVirtualMachine(firstPop).pop()
    getPopVirtualMachine(secondPop).push(getPopValue(firstPop) % getPopValue(secondPop))
  }
}
