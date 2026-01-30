Zadání:

Máš třídu `Person`. Třída `Person` má dvě vlastnosti - `name` typu String a `age` typu Integer. 

Napiš jednoduchý test v Groovy, který ověří, že pokud vytvoříš instanci třídy `Person` s názvem "John" a věkem 30, je name perosny skutečně "John" a age je skutečně 30.

---

Kód:

```groovy
import groovy.util.GroovyTestCase

class Person {
    String name
    Integer age
}

class PersonTest extends GroovyTestCase {
    void testPersonAttributes() {
        def person = new Person(name: "John", age: 30)
        
        assertEquals("John", person.name)
        assertEquals(30, person.age)
    }
}
```