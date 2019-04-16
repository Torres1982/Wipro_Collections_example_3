fun main(args: Array<String>) {
	val footballers = arrayOf("Messi", "Piatek", "Ronaldo", "Milik", "Rossi", "Iniesta", "Angulo")

    sortElementsInOrder(footballers)
}

fun sortElementsInOrder(array: Array<String>) {
	val sortedArray = array.sortedArray()
    
	println("***************") 
    println("Original Array:")
    println("***************")    
    for (item in array) {
        println(item)
    }
    
    println("***************")
    println("Sorted Array:")
    println("***************")
    for (element in sortedArray) {
        println(element)
    }
}