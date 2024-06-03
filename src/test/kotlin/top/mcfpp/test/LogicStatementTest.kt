package top.mcfpp.test

import top.mcfpp.test.util.MCFPPStringTest
import kotlin.test.Test

class LogicStatementTest {

    @Test
    fun ifTest(){
        val test =
            """
                func base(){
                    dynamic int i = 5;
                    if(i < 7){
                        print("i < 7");
                        dynamic int p;
                    }else{
                        print("i >= 7");
                        dynamic int p;
                    }
                    print(p);
                    print("end");
                }
            """.trimIndent()
        MCFPPStringTest.readFromString(test, "D:\\.minecraft\\saves\\MCFPP Studio\\datapacks")
    }

    @Test
    fun whileTest(){
        val test =
            """
                func generateSequence(){
                    dynamic int i = 0;
                    while(i < 10){
                        print(i);
                        i = i + 1;
                    }
            }
            """.trimIndent()
        MCFPPStringTest.readFromString(test, "D:\\.minecraft\\saves\\MCFPP Studio\\datapacks")
    }
}