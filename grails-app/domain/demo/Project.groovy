package demo

class Project {
    String name
    static constraints = {
        name matches: /[A-Z].*/
    }
}
