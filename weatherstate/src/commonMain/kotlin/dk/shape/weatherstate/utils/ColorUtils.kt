package dk.shape.weatherstate.utils

//fun Int.colorResourceToStateList(context: Context): ColorStateList {
//    val color = ContextCompat.getColor(context,this)
//    val states = array2dOfInt(1, 1)
//    val colors = intArrayOf(color)
//    return ColorStateList(states, colors)
//}

private fun array2dOfInt(sizeOuter: Int, sizeInner: Int): Array<IntArray> = Array(sizeOuter) { IntArray(sizeInner) }