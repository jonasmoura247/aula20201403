����   4 q  aula20200413/aep/Skate  java/lang/Object 
marcaTruck Ljava/lang/String; 
marcaRodas 
marcaShape tamanhoShape D tamanhoTruck I toString ()Ljava/lang/String; Code  java/lang/StringBuilder  Skate:
Marca Truck: 
     <init> (Ljava/lang/String;)V
     getMarcaTruck
     append -(Ljava/lang/String;)Ljava/lang/StringBuilder;    
Marca Rodas: 
  " #  getMarcaRodas % 
Marca Shape: 
  ' (  getMarcaShape * 
tamanho Shape: 
  , - . getTamanhoShape ()D
  0  1 (D)Ljava/lang/StringBuilder; 3 

  5   LineNumberTable LocalVariableTable this Laula20200413/aep/Skate; ()V
  <  :	 > @ ? java/lang/System A B out Ljava/io/PrintStream; D Criando um skate: 
 F H G java/io/PrintStream I  println K Tpara escolher um truck ideal, o shape deve equivaler a 7% do tamnho do truck sendo:  ;(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V
  N O  setMarcaTruck
  Q R  setMarcaRodas
  T U  setMarcaShape
  W X Y setTamanhoShape (D)V
  [ \ ] setTamanhoTruck (I)V	  _  	  a  	  c  	  e 	 
	  g   getTamanhoTruck ()I calcularTamanhoTruck@       
percentual 	resultado 
SourceFile 
Skate.java !                      	 
                o     =� Y� *� � � *� !� $� *� &� )� *� +� /2� � 4�    6        !  9  7       = 8 9     :     K     *� ;� =C� E� =J� E�    6              7        8 9     L     �      *� ;*+� M*,� P*-� S*� V*� Z�    6          	          7   >      8 9                            	 
          R      >     *+� ^�    6   
       ! 7        8 9          U      >     *+� `�    6   
    $  % 7        8 9          O      >     *+� b�    6   
    (  ) 7        8 9          X Y     >     *'� d�    6   
    ,  - 7        8 9      	 
   \ ]     >     *� f�    6   
    0  1 7        8 9                /     *� b�    6       4 7        8 9    #      /     *� ^�    6       8 7        8 9    (      /     *� `�    6       < 7        8 9    - .     /     *� d�    6       @ 7        8 9    h i     /     *� f�    6       D 7        8 9    j .     s     � =J� Ew< kI�(�kg9�    6       H  I  J  K  L 7   *     8 9          m 
    n 
   o    p