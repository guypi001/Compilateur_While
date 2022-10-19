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
        o (cons)= nil construit un arbre vide 
        o (cons T) = T retourne l’arbre T 
        o (cons A B) construit un arbre binaire ayant A pour fils gauche et B pour fils droit o(cons T1 T2 ... Tn) = (cons T1 (cons T2 ... (cons Tn-1 Tn) ...)
    - list : construction d’une liste 
        o (list) = nil construit une list vide
        o (list T) = (cons T nil) construit une liste a un élément
        o (list T1 T2 ... Tn) = (cons T1 (cons T2 ... (cons Tn nil) ...) construitune liste à n éléments
    - (hd T)  
        o si T = (cons A B) alors retourne A
        o si T = Symb alors retourne nilosi T = nil alors retourne nil(tl T)  
        o si T = (const A B) alors retourne B
        o si T = Symb alors retourne nilosi T = nil alors retourne nil
    - (f v1 ... vn) : appelde la fonction f avec les paramètres v1 à vn. 
        o f doit être une fonction définie par l’utilisateur 
        o l’appel de f doit comporter le bon nombre de paramètres ovérification de type à effecteur dans le compilateur... 
        
     La gestion des erreurs à l’exécution peut s’avérer assez complexe et ne pas les gérer proprement est irresponsable. Le langage While prend le parti de s’arranger pour qu’il n’y ait pas d’erreur à l’exécution. Pour ce faire, nil devient une valeur par défaut pour les variables non initialisées et pour lesopérations non définies : (hd nil) = (tl nil) = (hd symb) = (tl symb) = nil. 


3. Mémoire et variables
    La mémoire du processus stocke :
    1.Des arbres binaires  
    2.Des relations entre variables et arbres binaires 
        Il n’y a pas de variable dans les arbres binaires et ces derniers ne peuvent pas être modifiés.  
        Une variable s’évalue dans la mémoire courante et a nil pour valeur par défaut.  
        En mémoire, on stocke l’association entre une variable et l’arbre binaire qui y est associé. Les variables sont locales à la fonction dans laquelle elles apparaissent, pas de variable globale. Les variables ne permettent pas les effets de bord. Soit le code suivant : 
        
        1.X := (cons nil nil) 
        2.Y := X 
        3.X := nil
        
      Après l’exécution de la ligne 3, Y vaut (cons nil nil). Le seul moyen de changer la valeur de Y est d’utiliser la syntaxe Y := expression. Cela empêche, entre autres, la création de structures circulaires.
      
4. Commandes et structures de contrôle
    Le rôle fondamental des commandes en While est de modifier la relation entre les variables et les arbres binaires. Rien d’autre n’est modifiable. Ci-dessous, vous trouverez une liste des commandes et des structures de contrôle du langage While.
    
    nop
        Une commande qui ne fait rien. Ceci est utile pour tester la génération de code. 
    C1 ; C2  
        Exécute la commande C1 puis la commande C2. Le point-virgule est un opérateur correspondant à l’enchainement de commandes. 
    if E then C1 fi 
        si[𝐸]௕௢௢௟, exécute C1, sinon ne fait rien. 
    if E then C1 else C2 fi 
        si[𝐸]௕௢௢௟, exécute C1, sinon exécute C2. 
    while E do C od 
        si [𝐸]௕௢௢௟, exécute C. Répète l’opération tant que [𝐸]௕௢௢௟.
        Cette structure de contrôle peut boucler indéfiniment 
    for E do C od 
        Répète [𝐸]௜௡௧fois la commande C. 
        Attention : l’exécution de C ne doit pas perturber le décompte du for. 
            Soit v = [𝑋]௜௡௧
            for X do X := (cons nil X) od      double la longueur de X  
            En sortie de boucle X -> (consnil (consnil ... X ...)) 
        Cette structure de contrôle ne peut pas boucler indéfiniment. 
    foreach X in E do C od
        Pour chaque élément X de E, répéter C. 
        Exécute [𝐸]௜௡௧fois la commande C 
        Soit v la valeur de E en entrée dans la boucle 
        Exécute C avec X ← (hd v) puis recommencer avec v = (tl v) 
    V1, V2, ..., Vn = E1, E2, ..., En
        Evalue toutes les expressions E1, E2, ..., En En puis stocke les résultats dans les variables V1, V2, ..., Vn
        Attention le comportement escompté est le suivant 
            R1 := E1, R2 := E2, ..., Rn := En
            Puis 
            V1 := R1, V2 := R2, ..., Vn := Rn
    V1, V2, ..., Vn = (f E1 E2 ... Em)  
        Evalue la fonction (f E1 E2 ... Em) et stocke les valeurs de retour dans V1, V2, ..., Vn
        Attention : la fonction f doit prendre m paramètres et retourner n valeurs 
            function f : read X1, ..., Xm % ... % write R1, ..., Rn 
        Vérification de type faite à la compilation 
            
