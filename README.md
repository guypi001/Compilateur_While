# Compilateur_While

A. Domaine de calcul
1. Type de données et simulation des autres types 
    Le langage While ne permet de manipuler qu’un seul type de données : des arbres binaires. 
    Les types standards, tels que les entiers, les booléens ou encore les chaines de caractères sont simulés i.e. encodé sous la forme d’un arbre binaire       qui sera interprété en fonction des besoins. 
    
2. Les expressions 
    Le rôle des expressions est de dénoter des arbres binaires. 
    - nil correspond à l’arbre vide
    - Si Var est une variable, elle est remplacée par sa valeur quand elle est utilisée oNote : une variable non initialisée prend la valeur nil par défaut. 
    - Symb : un symbole i.e. un arbre feuille (lexeme Symbol) 
    - cons : construction d’arbres binaires 
        o(cons)= nil construit un arbre vide 
        o(cons T) = T retourne l’arbre T 
        o(cons A B) construit un arbre binaire ayant A pour fils gauche et B pour fils droit o(cons T1 T2 ... Tn) = (cons T1 (cons T2 ... (cons Tn-1 Tn) ...)
    - list : construction d’une liste 
        o(list) = nil construit une list vide
        o(list T) = (cons T nil) construit une liste a un élément
        o(list T1 T2 ... Tn) = (cons T1 (cons T2 ... (cons Tn nil) ...) construitune liste à n éléments
    - (hd T)  
        osi T = (cons A B) alors retourne A
        osi T = Symb alors retourne nilosi T = nil alors retourne nil(tl T)  
        osi T = (const A B) alors retourne B
        osi T = Symb alors retourne nilosi T = nil alors retourne nil
    - (f v1 ... vn) : appelde la fonction f avec les paramètres v1 à vn. 
        of doit être une fonction définie par l’utilisateur 
        ol’appel de f doit comporter le bon nombre de paramètres ovérification de type à effecteur dans le compilateur... 
        
     La gestion des erreurs à l’exécution peut s’avérer assez complexe et ne pas les gérer proprement est irresponsable. Le langage While prend le parti de s’arranger pour qu’il n’y ait pas d’erreur à l’exécution. Pour ce faire, nil devient une valeur par défaut pour les variables non initialisées et pour lesopérations non définies : (hd nil) = (tl nil) = (hd symb) = (tl symb) = nil. 
