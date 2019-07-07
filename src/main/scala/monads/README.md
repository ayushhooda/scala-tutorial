Data structures with map and flatMap seem to be quite common.
In fact there's a name that describes this class of a data structures together with some algebraic
laws that they should have.
They are called Monads.

A monad M is a parametric type M[T] with two operations, flatMap and unit, that have to satisfy some laws.

trait M[T] {
    def flatMap[U](f: T => M[U]): M[U]
}

def unit[T](x: T): M[T]

Examples of Monads:
1. List is a Monad with unit(x) = List(x)
2. Set is a Monad with unit(x) = Set(x)
3. Option is a monad with unit(x) = Some(x)
4. Generator is a monad with unit(x) = single(x)

Note: flatMap is an operation on each of these types, whereas unit in Scala is different for each Monad.

map can be defined for every monad as a combination of flatMap and unit:
m map f == m flatMap (x => unit(f(x)))
        == m flatMap (f andThen unit)

Note: In scala, we donot have unit(), because every monad have different expression that gives the unit value
      Therefore, in scala, map is also a primitive function that is being defined on every Monad.

Monad Laws:-
To qualify as Monad, a type has to satisfy three laws:
1. Associativity:
                    (m flatMap f) flatMap g == m flatMap (x => f(x) flatMap g)
2. Left unit:
                    unit(x) flatMap f == f(x)
3. Right unit:
                    m flatMap unit == m