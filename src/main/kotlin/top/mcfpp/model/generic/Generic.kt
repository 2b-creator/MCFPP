package top.mcfpp.model.generic

import top.mcfpp.antlr.mcfppParser
import top.mcfpp.model.CanSelectMember
import top.mcfpp.core.lang.Var
import top.mcfpp.type.MCFPPType
import top.mcfpp.model.function.Function
import top.mcfpp.model.function.FunctionParam

interface Generic<T> where T : Function{

    var ctx: mcfppParser.FunctionBodyContext

    var index: Int

    val readOnlyParams: ArrayList<FunctionParam>

    fun invoke(readOnlyArgs: ArrayList<Var<*>>, normalArgs: ArrayList<Var<*>>, caller: CanSelectMember?)

    fun compile(readOnlyArgs: ArrayList<Var<*>>) : T

    fun isSelf(key: String, readOnlyParams: List<MCFPPType>, normalParams: List<MCFPPType>): Boolean

    fun isSelfWithDefaultValue(key: String, readOnlyParams: List<MCFPPType>, normalParams: List<MCFPPType>): Boolean
}