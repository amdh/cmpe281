/*
  * JBoss, Home of Professional Open Source
  * Copyright 2005, JBoss Inc., and individual contributors as indicated
  * by the @authors tag. See the copyright.txt in the distribution for a
  * full listing of individual contributors.
  *
  * This is free software; you can redistribute it and/or modify it
  * under the terms of the GNU Lesser General Public License as
  * published by the Free Software Foundation; either version 2.1 of
  * the License, or (at your option) any later version.
  *
  * This software is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  * Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public
  * License along with this software; if not, write to the Free
  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  */
package org.jboss.test.aop.basic;

/**
 * @author <a href="mailto:kabirkhan@bigfoot.com">Kabir Khan</a>
 * @version $Revision: 37406 $
 */
public class PrivateProtectedPOJO
{

   protected PrivateProtectedPOJO()
   {
      System.out.println("PrivateProtectedPOJO protected constructor");
   }

   private PrivateProtectedPOJO(String s)
   {
      System.out.println("PrivateProtectedPOJO private constructor");
   }

   public PrivateProtectedPOJO(String s, int i)
   {
      System.out.println("PrivateProtectedPOJO public constructor");
      new PrivateProtectedPOJO(s);
   }

   private void privateMethod()
   {
      System.out.println("PrivateProtectedPOJO.privateMethod");
   }

   protected void protectedMethod()
   {
      System.out.println("PrivateProtectedPOJO.protectedMethod");
   }

   private static void privateStaticMethod()
   {
      System.out.println("PrivateProtectedPOJO.privateStaticMethod");
   }

   protected static void protectedStaticMethod()
   {
      System.out.println("PrivateProtectedPOJO.protectedStaticMethod");
   }

   public void callProtectedMethod()
   {
      protectedMethod();
   }

   public void callPrivateMethod()
   {
      privateMethod();
   }


   public static void callPrivateStaticMethod()
   {
      privateStaticMethod();
   }

   public static void callProtectedStaticMethod()
   {
      protectedStaticMethod();
   }

   public static void callPrivateConstructor()
   {
      new PrivateProtectedPOJO("s");
   }
}
