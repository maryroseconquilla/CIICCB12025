package animals;

interface HasExoskeleton { 
abstract int getNumberOfSections(); 
} 
abstract class Insect implements HasExoskeleton { 
abstract int getNumberOfLegs(); 
} 

