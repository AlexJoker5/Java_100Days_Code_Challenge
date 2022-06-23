boolean yes(){
    /*open this file using jshell.
    * I use this file to test Logical Operators.*/
    System.out.println("TRUE");
    return true;
}
boolean no(){
    System.out.println("FALSE");
    return false;
}
/* & operators result is
*       True & True = True
*       True & False = False
*       False & True = False
*       False & False = False
* && operators result is
*       True && True = True
*       True && False = False
*       False && True = False   if false the prior one, && neglects the later one and return false.
*       False && False = False  if false the prior one, && neglects the later one and return false.
*  | operator result is
*       True | True = True
*       True | False = True
*       False | True = True
*       False | False = False
*  || operator result is
*       True || True = True     if true the prior one, && neglects the later one and return true.
*       True || False = True    if true the prior one, && neglects the later one and return true.
*       False || True = True
*       False || False = False
*  ^ operator result is
*       True ^ True = False
*       True ^ False = True
*       False ^ True = True
*       False ^ False = True
* */