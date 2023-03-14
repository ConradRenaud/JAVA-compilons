


/**

overloading,

- utiliser pour augm la visibilité d'un program

- se fait à l'intérieur de la mm class

- les param doivent être différents

- ne peut être effectué en modifiant uniquement le type de retour de la method,
  le type de retour peut être identique ou différent , mais vous devez changer les params

*/


/**

overriding,

- fournir l'implémentation spécifique d'une method qui est deja fourni par la super class

- se fait dans 2 class qui ont une relation d'héritage

- les param doivent être les mm

- le type de retour doit être identique et co-variant (garder la structure de l'autre method)

*/



le bloc d'initialisation d'instance est utilisé pour initialiser les membres de l'instance (propriété de l'objet),
il s'exécute à chaque fois qu'un objet est créé.

3 règles ==>

1-) bloc init. d'instance est créé quand l'instance est créé,
2-) ce bloc est invoqué après que le constructor de la super-class (parent) ait été invoqué,
3-) ce bloc vient dans l'ordre dans lequel il apparaît.