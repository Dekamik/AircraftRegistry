package se.dennisvonbargen.aircraftregistry

import se.dennisvonbargen.aircraftregistry.integration.DataAccessObject
import java.util.Scanner
import kotlin.system.exitProcess

/**
 * Created by Dennis on 2016-06-01.
 */
class AircraftRegistry (private val dao: DataAccessObject) {

    private val functions: RegistryFunctions = RegistryFunctions(dao)
    private val input = Scanner(System.`in`)

    private fun inputCommand(prompt: String?) : String {
        print(prompt)
        return input.nextLine()
    }

    private fun runCommand(command: String?) {
        if ("exit".equals(command))
            exitProcess(0)
        println("<< $command")
    }

    internal fun run() {
        while(true) {
            val command: String = inputCommand(">> ")
            runCommand(command)
        }
    }
}