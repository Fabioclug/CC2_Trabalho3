/**
 */
package ufscar.compiladores2.musy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ufscar.compiladores2.musy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ufscar.compiladores2.musy.MusyPackage
 * @generated
 */
public class MusyAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MusyPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusyAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MusyPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MusySwitch<Adapter> modelSwitch =
    new MusySwitch<Adapter>()
    {
      @Override
      public Adapter caseMidi(Midi object)
      {
        return createMidiAdapter();
      }
      @Override
      public Adapter caseMidiBody(MidiBody object)
      {
        return createMidiBodyAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseTrack(Track object)
      {
        return createTrackAdapter();
      }
      @Override
      public Adapter caseTrackBody(TrackBody object)
      {
        return createTrackBodyAdapter();
      }
      @Override
      public Adapter caseMoreTrackBody(MoreTrackBody object)
      {
        return createMoreTrackBodyAdapter();
      }
      @Override
      public Adapter caseBodyComponent(BodyComponent object)
      {
        return createBodyComponentAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseTimeSignature(TimeSignature object)
      {
        return createTimeSignatureAdapter();
      }
      @Override
      public Adapter caseCustomNote(CustomNote object)
      {
        return createCustomNoteAdapter();
      }
      @Override
      public Adapter caseChord(Chord object)
      {
        return createChordAdapter();
      }
      @Override
      public Adapter caseChordParams(ChordParams object)
      {
        return createChordParamsAdapter();
      }
      @Override
      public Adapter caseCustomNoteParam(CustomNoteParam object)
      {
        return createCustomNoteParamAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Midi <em>Midi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Midi
   * @generated
   */
  public Adapter createMidiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.MidiBody <em>Midi Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.MidiBody
   * @generated
   */
  public Adapter createMidiBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Track <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Track
   * @generated
   */
  public Adapter createTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.TrackBody <em>Track Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.TrackBody
   * @generated
   */
  public Adapter createTrackBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.MoreTrackBody <em>More Track Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.MoreTrackBody
   * @generated
   */
  public Adapter createMoreTrackBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.BodyComponent <em>Body Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.BodyComponent
   * @generated
   */
  public Adapter createBodyComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.TimeSignature <em>Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.TimeSignature
   * @generated
   */
  public Adapter createTimeSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.CustomNote <em>Custom Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.CustomNote
   * @generated
   */
  public Adapter createCustomNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Chord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Chord
   * @generated
   */
  public Adapter createChordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ChordParams <em>Chord Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ChordParams
   * @generated
   */
  public Adapter createChordParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.CustomNoteParam <em>Custom Note Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.CustomNoteParam
   * @generated
   */
  public Adapter createCustomNoteParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MusyAdapterFactory
